-- Write your query below
SELECT *  FROM customers  WHERE  customer_id IN  (SELECT  customer_id from orders
group by customer_id
having
sum(CASE WHEN  product_name = 'A' THEN 1 ELSE 0 END) >0 AND
sum(CASE WHEN  product_name = 'B' THEN 1 ELSE 0 END)>0 AND
sum(CASE WHEN  product_name = 'C' THEN 1 ELSE 0 END) = 0 ) ORDER BY customer_name ASC