package persistence.sql.ddl;

import domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateQueryBuilderTest {
    private static final Logger logger = LoggerFactory.getLogger(CreateQueryBuilderTest.class);
    private final CreateQueryBuilder createQueryBuilder = new CreateQueryBuilder(Person.class);

    @DisplayName("Person 객체로 CREATE 쿼리 생성 테스트")
    @Test
    void test_getQuery() {
        String query = createQueryBuilder.getQuery(Person.class);
        logger.info(query);
        assertEquals(query, "CREATE TABLE Person( id BIGINT, name VARCHAR(255), age INTEGER, PRIMARY KEY (id) );");
    }

}
