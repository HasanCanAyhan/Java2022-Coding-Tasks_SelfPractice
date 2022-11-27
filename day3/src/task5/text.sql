
--SELECT

SELECT contact_name,company_name,city from customers;

select contact_name Adi, company_name SirketAdi, city Sehir from customers;

--WHERE

select * from customers
where city = 'London';

select * from products  where category_id = 1 or category_id = 3;


select * from products  where category_id = 1 and unit_price >= 10;

--Order by , asc , desc

select * from customers
order by company_name;

select * from products
order by unit_price desc;

select * from products
order by category_id;

select * from products
where category_id =1
order by unit_price asc;

--group by

select count(*) Adet from products; --77
select count(*) from products where category_id = 2; --12

select category_id, count(*) Adet from products
group by category_id
order by category_id;

select category_id, count(*) Adet from products
group by category_id
having count(*) < 10;

select category_id, count(*) Adet from products
where unit_price > 20
group by category_id
having count(*) < 10;

--inner : sadece iki tarafta eslesenler ,right left join

select product_id,product_name,unit_price,category_name
from products inner join categories c
                         on products.category_id = c.category_id;

--DTO : DTA TRANSFORMATION OBJECT

select * from products p  left join order_details od
                                    on p.product_id = od.product_id; -- solda olup sagda olmayanlar

select * from customers c left join orders o
                                    on c.customer_id = o.customer_id;

--isNull
select * from customers c left join orders o
                                    on c.customer_id = o.customer_id
where o.customer_id is null ;


select * from products p  inner join  order_details od
                                      on p.product_id = od.product_id
                          join orders o on o.order_id = od.order_id;

--C# Oyun Projesi