#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int n, original, sum = 0;
    cout << "Enter a number: ";
    cin >> n;

    original = n;

    while (n > 0) {
        int digit = n % 10;
        sum += digit * digit * digit;  // Cube the digit (for 3-digit numbers)
        n /= 10;
    }

    if (sum == original) {
        cout << original << " is an Armstrong number" << endl;
    } else {
        cout << original << " is not an Armstrong number" << endl;
    }

    return 0;
}

