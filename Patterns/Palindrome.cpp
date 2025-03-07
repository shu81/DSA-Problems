#include <iostream>
using namespace std;

int main() {
    int n, reversed = 0, original, lastDigit;

    cout << "Enter a number: ";
    cin >> n;

    original = n;

    while (n > 0) {
        lastDigit = n % 10;
        reversed = reversed * 10 + lastDigit;
        n /= 10;
    }

    if (original == reversed) {
        cout << original << " is a palindrome" << endl;
    } else {
        cout << original << " is not a palindrome" << endl;
    }

    return 0;
}
