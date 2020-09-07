#include <iostream>
#include <sstream>

using namespace std;

bool isPalindrome(int);

int main() {
	int num, pal = -1;

	for (int i = 100; i <= 999; i++) {
		for (int j = 100; j <= 999; j++) {
			num = i * j;
			if (isPalindrome(num) && num > pal) {
				pal = num;
			}
		}
	}

	cout << "Largest Palindrome: " << pal << endl;

	system("Pause");
	return 0;
}

bool isPalindrome(int n) {
	stringstream ss;
	ss << n;
	string s;
	ss >> s;

	for (int i = 0; i < s.length(); i++) {
		if (s.at(i) != s.at(s.length() - i - 1)) {
			return false;
		}
	}

	return true;
}