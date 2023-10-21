package persistence.sql.ddl;

import domain.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CreateQueryBuilderTest {
    private final CreateQueryBuilder createQueryBuilder = new CreateQueryBuilder(new QueryValidator(), Person.class);

    @DisplayName("Person 객체로 CREATE 쿼리 생성 테스트")
    @Test
    void test_bulidQuery() {
        assertEquals(createQueryBuilder.buildQuery(), "CREATE TABLE users(id BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, nick_name VARCHAR(255), old INTEGER, email VARCHAR(255) NOT NULL);");
    }

}
