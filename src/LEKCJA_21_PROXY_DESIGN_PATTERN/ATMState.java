
package LEKCJA_21_PROXY_DESIGN_PATTERN;

public interface ATMState {
 void insertCard();
 void ejectCard();
 void insertPin(int pinEntered);
 void requestCash(int cashToWithdraw);
}
