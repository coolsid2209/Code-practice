-- 1068. Product Sales Analysis I

-- Solution

select p.product_name, s.year, s.price 
from sales s 
left join product p 
ON p.product_id = s.product_id 
order by s.quantity asc, s.price desc