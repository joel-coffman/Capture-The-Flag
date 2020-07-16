package edu.jhu.cloudsec.ctf.services;

import java.util.Arrays;
import java.util.List;

public class H2InjectionChecker {
    H2InjectionChecker() {}
    // all keywords but "and" and "or"
    private static final List<String> keywords = Arrays.asList(
            "ALL",
            "ARRAY",
            "AS",
            "BETWEEN",
            "BOTH",
            "CASE",
            "CHECK",
            "CONSTRAINT",
            "CROSS",
            "CURRENT_CATALOG",
            "CURRENT_DATE",
            "CURRENT_SCHEMA",
            "CURRENT_TIME",
            "CURRENT_TIMESTAMP",
            "CURRENT_USER",
            "DISTINCT",
            "EXCEPT",
            "EXISTS",
            "FALSE",
            "FETCH",
            "FILTER",
            "FOR",
            "FOREIGN",
            "FROM",
            "FULL",
            "GROUP",
            "GROUPS",
            "HAVING",
            "IF",
            "ILIKE",
            "IN",
            "INNER",
            "INTERSECT",
            "INTERSECTS",
            "INTERVAL",
            "IS",
            "JOIN",
            "LEADING",
            "LEFT",
            "LIKE",
            "LIMIT",
            "LOCALTIME",
            "LOCALTIMESTAMP",
            "MINUS",
            "NATURAL",
            "NOT",
            "NULL",
            "OFFSET",
            "ON",
            "ORDER",
            "OVER",
            "PARTITION",
            "PRIMARY",
            "QUALIFY",
            "RANGE",
            "REGEXP",
            "RIGHT",
            "ROW",
            "_ROWID_",
            "ROWNUM",
            "ROWS",
            "SELECT",
            "SYSDATE",
            "SYSTIME",
            "SYSTIMESTAMP",
            "TABLE",
            "TODAY",
            "TOP",
            "TRAILING",
            "TRUE",
            "UNION",
            "UNIQUE",
            "UNKNOWN",
            "USING",
            "VALUES",
            "WHERE",
            "WINDOW",
            "WITH"
    );

    public static boolean inputCouldModifyTable(String input) {
        String uppercaseInput = input.toUpperCase();
        for (String keyword : keywords) {
            if (uppercaseInput.contains(keyword)) {
                return true;
            }
        }
        return false;
    }
}
