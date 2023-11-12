package info.h9.id.config

import info.h9.common.utils.BaseTest
import lombok.RequiredArgsConstructor
import org.springframework.security.crypto.codec.Utf8
import spock.lang.Ignore;

@RequiredArgsConstructor
class SecurityConfigurationTest extends BaseTest {

    @Ignore
    def "test securityFilterChain"() {
        when:
        print("hoge")
        then:
        true
    }
}
