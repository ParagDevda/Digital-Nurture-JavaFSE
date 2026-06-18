CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountType='Savings';

    DBMS_OUTPUT.PUT_LINE(
        SQL%ROWCOUNT || ' account(s) updated.'
    );

    COMMIT;

END;
/