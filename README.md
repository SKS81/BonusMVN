# ТЗ
Вашей задачей будет переделать проект с приложением про бонус с покупки на Мавен и хорошо его протестировать.

Шаг 1. Создайте проект на базе Maven.

Шаг 2. Добавьте в проект JUnit Jupiter & Surefire Plugin

Шаг 3. Создайте сервисный класс со следующим исходным кодом:


public class BonusService { public long calculate(long amount, boolean registered) { int percent = registered ? 3 : 1;
    long bonus = amount * percent / 100;
    long limit = 500;
    if (bonus > limit) { bonus = limit; }
    return bonus;
  }
}

Шаг 4. Создайте тестовый класс со следующим исходным кодом:

import static org.junit.jupiter.api.Assertions.*;
public class BonusServiceTest {
  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndUnderLimit() {
    BonusService service = new BonusService();
        long amount = 1000;
    boolean registered = true;
    long expected = 30;
    long actual = service.calculate(amount, registered);
    assertEquals(expected, actual);
  }
  @org.junit.jupiter.api.Test
  void shouldCalculateForRegisteredAndOverLimit() {
    BonusService service = new BonusService();
    long amount = 1_000_000;
    boolean registered = true;
    long expected = 500;
    long actual = service.calculate(amount, registered);
    assertEquals(expected, actual);
  }
}

Шаг 5. Запустите тесты через mvn clean test, убедитесь, что они запускаются и проходят.

Шаг 6. **Проведите тест-дизайн сервисного класса, допишите недостающие тесты.**

Шаг 7. **Убедитесь, что тесты запускаются и проходят.**
