package info.h9.domain

import jakarta.persistence.EntityManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional
import spock.lang.Specification

@SpringBootTest
@Transactional
class BaseTest extends Specification {

    @Autowired
    EntityManager entityManager

    public void buildTestDate(String filePathBySql) {
        try (InputStream is = this.getClass().getResourceAsStream("/${filePathBySql}")) {
            BufferedReader br = new BufferedReader(new InputStreamReader(is))
            //println(br.readLine())
            br.readLines().stream().forEach {
                entityManager.createNativeQuery(it)
            }

        } catch (IOException e) {
            e.printStackTrace()
        }
    }


}
