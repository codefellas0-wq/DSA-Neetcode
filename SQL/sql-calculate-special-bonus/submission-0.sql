update employees
SET salary = 0 
 where employee_id%2 = 0 OR name Like 'M%';
SELECT employee_id , salary AS bonus from employees
ORDER BY employee_id;
