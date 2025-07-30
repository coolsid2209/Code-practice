-- 1378. Replace Employee ID With The Unique Identifier

-- Solution

select en.unique_id, e.name from EmployeeUNI en right join Employees e ON e.id = en.id 