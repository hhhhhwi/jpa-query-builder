package persistence.sql.ddl;

import static java.lang.String.format;

public class DropQueryBuilder implements QueryBuilder{
    private final static String DROP_TABLE_COMMAND = "DROP TABLE %s;";

    private QueryValidator queryValidator;

    public DropQueryBuilder(QueryValidator queryValidator) {
        this.queryValidator = queryValidator;
    }

    @Override
    public String buildQuery(Class<?> clazz) {
        queryValidator.checkIsEntity(clazz);

        return format(DROP_TABLE_COMMAND, new Table(clazz).getName());
    }
}
