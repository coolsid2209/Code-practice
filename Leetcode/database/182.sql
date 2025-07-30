-- 182. Duplicate Emails

-- Solution

SELECT
    email AS Email
FROM
    person
GROUP BY
    Email
HAVING
    COUNT(*) > 1;