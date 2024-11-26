-- 코드를 입력하세요
select count(nametable.name) from (SELECT name from animal_ins group by name) as nametable;