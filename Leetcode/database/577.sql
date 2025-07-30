-- 577. Employee Bonus

-- Solution

select emp.name, bo.bonus from employee emp
left join bonus bo ON bo.empId = emp.empId 
where bo.bonus < 1000 or bonus is null