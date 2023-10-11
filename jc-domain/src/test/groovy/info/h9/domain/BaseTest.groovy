package info.h9.domain

import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
@AutoConfigureTestEntityManager
@Transactional
class BaseTest extends Specification {

    @Autowired
    EntityManager entityManager

    void buildTestData(String filePathBySql) {
        try (InputStream is = this.getClass().getResourceAsStream("/${filePathBySql}")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is))
            br
            .readLines()
            .stream()
            .filter{
                   it.toUpperCase().contains("DELETE")
                || it.toUpperCase().contains("UPDATE")
                || it.toUpperCase().contains("INSERT")
            }
            .forEach {
                entityManager.createNativeQuery(it).executeUpdate()
            }

        } catch (IOException e) {
            e.printStackTrace()
        }
    }

    <ENTITY> List<ENTITY> find(String whereString, Class<ENTITY> clazz) {
       return entityManager.createQuery("""
            select t 
              from ${clazz.getName()} t 
             ${whereString != null ? "where ${whereString}" : ""}
        """, clazz).getResultList()
    }

    <ENTITY> ENTITY findOne(String whereString, Class<ENTITY> clazz) {
        return entityManager.createQuery("""
            select t 
              from ${clazz.getName()} t 
             ${whereString != null ? "where ${whereString}" : ""}
        """, clazz).getSingleResult()
    }


}
