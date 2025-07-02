```bash
01-07-25 21:05:08.254 restartedMain         INFO c.c.o.OrmLearnApplication                      main   20 Inside main
01-07-25 21:05:08.255 restartedMain         INFO c.c.o.OrmLearnApplication       testGetAllCountries   27 Start
01-07-25 21:05:08.411 restartedMain        DEBUG org.hibernate.SQL                      logStatement  135 select c1_0.co_code,c1_0.co_name from country c1_0
01-07-25 21:05:08.449 restartedMain        DEBUG c.c.o.OrmLearnApplication       testGetAllCountries   29 countries=[Country{code='IN', name='India'}, Country{code='US', name='United States of America'}]
01-07-25 21:05:08.450 restartedMain         INFO c.c.o.OrmLearnApplication       testGetAllCountries   30 End
```