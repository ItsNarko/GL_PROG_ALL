#include <stdio.h>
#include <stdlib.h>

// Function prototypes
void displayMainMenu();
void handleMenuSelection(int choice);
void clearScreen();

int main() {
    int choice;
    
    while (1) {
        displayMainMenu();
        printf("Enter your choice (1-4, 0 to exit): ");
        scanf("%d", &choice);

        if (choice == 0) {
            break; // Exit the loop, hence the program
        }

        handleMenuSelection(choice);
    }

    return 0;
}

void displayMainMenu() {
    clearScreen();
    printf("Select a category:\n");
    printf("1. Data type Keywords\n");
    printf("2. Qualifier Keywords\n");
    printf("3. Loop Control Structure Keywords\n");
    printf("4. Jumping Control Keywords\n");
}

void handleMenuSelection(int choice) {
    char keyword[20];
    switch (choice) {
        case 1:
            printf("Choose a data type keyword (int, float, char): ");
            break;
        case 2:
            printf("Choose a qualifier keyword (const, volatile): ");
            break;
        case 3:
            printf("Choose a loop control keyword (for, while, do): ");
            break;
        case 4:
            printf("Choose a jumping control keyword (goto, continue, break): ");
            break;
        default:
            printf("Invalid choice.\n");
            return;
    }

    scanf("%s", keyword);
    defineKeyword(keyword);
}

void clearScreen() {
#ifdef _WIN32
    system("cls");
#else
    system("clear");
#endif
}

void defineKeyword(char* keyword) {
    // Definitions based on the keyword
    if (strcmp(keyword, "int") == 0) {
        printf("int: Defines a variable that can store integers.\n");
    } else if (strcmp(keyword, "float") == 0) {
        printf("float: Defines a variable that can store floating-point numbers.\n");
    } else if (strcmp(keyword, "char") == 0) {
        printf("char: Defines a variable that can store characters.\n");
    } else if (strcmp(keyword, "const") == 0) {
        printf("const: Defines a variable whose value cannot be changed.\n");
    } else if (strcmp(keyword, "volatile") == 0) {
        printf("volatile: Indicates that a variable's value can be changed in ways not explicitly specified by the program.\n");
    } else if (strcmp(keyword, "for") == 0) {
        printf("for: Defines a loop that repeats specified instructions up to a certain number of times.\n");
    } else if (strcmp(keyword, "while") == 0) {
        printf("while: Defines a loop that continues as long as a specified condition is true.\n");
    } else if (strcmp(keyword, "do") == 0) {
        printf("do: Defines a loop that executes at least once and continues as long as a specified condition is true after the first pass.\n");
    } else if (strcmp(keyword, "goto") == 0) {
        printf("goto: Provides an unconditional jump from the goto to a labeled statement in the same function.\n");
    } else if (strcmp(keyword, "continue") == 0) {
        printf("continue: Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.\n");
    } else if (strcmp(keyword, "break") == 0) {
        printf("break: Terminates the smallest enclosing loop or switch.\n");
    } else {
        printf("Keyword not recognized.\n");
    }

    printf("\nPress any key to return to the main menu...\n");
    getchar(); getchar(); // to consume the newline character and wait for new input
}
