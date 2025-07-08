```bash
2025-07-07T17:29:53.050+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.c.spring_learn.SpringLearnApplication  : START displayCountry
2025-07-07T17:29:53.051+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] o.s.c.s.ClassPathXmlApplicationContext   : Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@48c8a9c9
2025-07-07T17:29:53.082+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] o.s.b.f.xml.XmlBeanDefinitionReader      : Loaded 1 bean definitions from class path resource [country.xml]
2025-07-07T17:29:53.083+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] o.s.b.f.s.DefaultListableBeanFactory     : Creating shared instance of singleton bean 'country'
2025-07-07T17:29:53.084+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.cognizant.spring_learn.model.Country   : Inside Country Constructor.
2025-07-07T17:29:53.085+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] o.s.beans.CachedIntrospectionResults     : Not strongly caching class [com.cognizant.spring_learn.model.Country] because it is not cache-safe
2025-07-07T17:29:53.086+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.cognizant.spring_learn.model.Country   : Setting country code.
2025-07-07T17:29:53.086+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.cognizant.spring_learn.model.Country   : Setting country name.
2025-07-07T17:29:53.087+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.c.spring_learn.SpringLearnApplication  : Country : Country [code=IN, name=India]
2025-07-07T17:29:53.089+05:30 DEBUG 24424 --- [spring-learn] [  restartedMain] c.c.spring_learn.SpringLearnApplication  : END displayCountry
```