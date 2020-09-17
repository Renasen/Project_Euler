#include <iostream>

int main() {
    long num, chainSize = 1, maxSize = 0, startingNum = 0;
    
    for(int i = 1; i < 1000000; i++) {
        num = i;
        
        while (num != 1) {
            if (num % 2 == 0) {
                num /= 2;
                chainSize++;
            } else {
                num = (3*num) + 1;
                chainSize++;
            }
        }
        
        if (chainSize > maxSize) {
            maxSize = chainSize;
            startingNum = i;
            
            std::cout << "New maxSize: " << maxSize << "\nstartingNum: " << startingNum << "\n\n";
        }
        chainSize = 0;
    }
    
    std::cout << "Max Starting Num: " << startingNum << "\n";

    return 0;
}
