package les4.Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class UserServiceTest {

    @Test
    void testUserServiceWithMockRepository() {
// Создаем мок UserRepository
        UserRepository userRepository = mock(UserRepository.class);// мок создает изолированный объект по классу(как бы делает копию)

// Создаем объект UserService, передавая мок UserRepository
        UserService userService = new UserService(userRepository);// здесь тоже можно было бы использовать мок

// Задаем ожидаемый результат
        int userId = 1;
        String expectedUsername = "JohnDoe"; // Предположим, что у пользователя с ID 1 такое имя

// Устанавливаем ожидание вызова метода getUserById с userId и возвращаем ожидаемый объект User
        when(userRepository.getUserById(userId)).thenReturn(new User(userId, expectedUsername));
        // вроде assertEquals (сравнивает ожидаемое значение(userRepository.getUserById(userId) и new User(userId, expectedUsername)

// Вызываем метод getUserUsernameById и проверяем, что результат соответствует ожиданиям
        String username = userService.getUserUsernameById(userId);
        assertEquals(expectedUsername, username);

// Проверяем, что метод getUserById был вызван ровно один раз с правильными аргументами
        verify(userRepository, times(1)).getUserById(userId);
    }
}