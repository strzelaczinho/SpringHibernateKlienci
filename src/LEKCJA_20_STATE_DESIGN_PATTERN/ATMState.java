
package LEKCJA_20_STATE_DESIGN_PATTERN;

public interface ATMState {
 void insertCard();
 void ejectCard();
 void insertPin(int pinEntered);
 void requestCash(int cashToWithdraw);
}
