package task1105;

/* 
ИТ-компания
Исправь девять классов: Worker (сотрудник), Clerk (клерк), IT (ИТ-специалист), Programmer (программист), ProjectManager (менеджер проекта), CTO (технический директор), HR (рекрутер), OfficeManager (офис-менеджер), Cleaner (уборщик).
Унаследуй программиста, менеджера проекта и технического директора от ИТ-специалиста.
Унаследуй рекрутера, уборщика и офис-менеджера от клерка.
Унаследуй клерка и ИТ-специалиста от сотрудника.


Requirements:
1. В классе Solution должен быть public класс Worker (сотрудник).
2. В классе Solution должен быть public класс Clerk (клерк).
3. В классе Solution должен быть public класс IT (ИТ-специалист).
4. В классе Solution должен быть public класс Programmer (программист).
5. В классе Solution должен быть public класс ProjectManager (менеджер проекта).
6. В классе Solution должен быть public класс CTO (технический директор).
7. В классе Solution должен быть public класс HR (рекрутер).
8. В классе Solution должен быть public класс OfficeManager (офис-менеджер).
9. В классе Solution должен быть public класс Cleaner (уборщик).
10. Классы Programmer, ProjectManager и CTO должны быть унаследованы от класса IT.
11. Классы HR, Cleaner и OfficeManager должны быть унаследованы от класса Clerk.
12. Классы Clerk и IT должны быть унаследованы от класса Worker.*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Worker {

    }

    public class Clerk extends Worker {

    }

    public class IT extends Worker {

    }

    public class Programmer extends IT {

    }

    public class ProjectManager extends IT {

    }

    public class CTO extends IT {

    }

    public class OfficeManager extends Clerk {

    }

    public class HR extends Clerk {

    }

    public class Cleaner extends Clerk {

    }
}
