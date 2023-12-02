# Обработка исключений

## Создать программу управления банковским счетом (Account).

Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств. При этом она должна обрабатывать следующие исключительные ситуации:

![image](https://github.com/Winniebob/Account/assets/131287620/e5bb3de5-fc30-4ccc-be41-4a4e441ac920)

Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.

![image](https://github.com/Winniebob/Account/assets/131287620/b14c0abf-b01a-402f-8271-5ba3a5742f22)

Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.

![image](https://github.com/Winniebob/Account/assets/131287620/3252ca79-2cc3-426e-b554-96331e14b80f)

Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.

![image](https://github.com/Winniebob/Account/assets/131287620/8f6502f8-d77a-4b27-aed6-6c1a81e70ef8)

![image](https://github.com/Winniebob/Account/assets/131287620/9118b038-0f68-4ba8-8a44-766f269a2be8)

Продемонстрируйте работу вашего приложения:

![image](https://github.com/Winniebob/Account/assets/131287620/f3fec1c4-451b-4c55-b7ed-8eda3a5c27c7)

## Создать несколько типов счетов, унаследованных от Account, например: CreditAcciunt, DebitAccount.

Создать класс (Transaction), позволяющий проводить транзакции между счетами (переводить сумму с одного счета на другой)

Класс Transaction должен возбуждать исключение в случае неудачной попытки перевести деньги с одного счета на другой.

Продемонстрируйте работу вашего приложения:

![image](https://github.com/Winniebob/Account/assets/131287620/7a9042f3-fecc-4255-b67f-52187aefd269)

![image](https://github.com/Winniebob/Account/assets/131287620/21b6ee69-abad-4ebc-a3f6-61e2083a9e71)

![image](https://github.com/Winniebob/Account/assets/131287620/072be3c6-f000-4317-bcac-1297cb007f95)

![image](https://github.com/Winniebob/Account/assets/131287620/b76fecb2-e7c9-4c9c-b1b5-6a74bb258e63)
