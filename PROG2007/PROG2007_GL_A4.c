#include <stdio.h>
#include <string.h>
#include <stdlib.h>

#define MAX_CONTACTS 100

typedef struct {
    char firstName[50];
    char lastName[50];
    char phoneNumber[20];
} Contact;

Contact contacts[MAX_CONTACTS];
int contactCount = 0;

void addContact();
void displayContacts();
void searchContact();
void deleteContact();
void printMenu();

int main() {
    int choice;
    printf("Welcome to the Contact List!\n");

    while (1) {
        printMenu();
        scanf("%d", &choice);
        getchar(); // consume newline

        switch (choice) {
            case 1:
                addContact();
                break;
            case 2:
                displayContacts();
                break;
            case 3:
                searchContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                printf("Goodbye!\n");
                return 0;
            default:
                printf("Invalid choice. Please enter a number between 1 and 5.\n");
        }
    }

    return 0;
}

void printMenu() {
    printf("\n1. Add a new contact\n");
    printf("2. Display all contacts\n");
    printf("3. Search by last name\n");
    printf("4. Delete by last name\n");
    printf("5. Exit\n\n");
    printf("Enter your choice: ");
}

void addContact() {
    if (contactCount >= MAX_CONTACTS) {
        printf("Contact list is full!\n");
        return;
    }

    printf("Enter first name: ");
    scanf("%49s", contacts[contactCount].firstName);
    printf("Enter last name: ");
    scanf("%49s", contacts[contactCount].lastName);
    printf("Enter phone number: ");
    scanf("%19s", contacts[contactCount].phoneNumber);

    contactCount++;
    printf("Contact added successfully!\n");
}

void displayContacts() {
    if (contactCount == 0) {
        printf("Contact list is empty!\n");
        return;
    }

    printf("Contacts:\n");
    for (int i = 0; i < contactCount; i++) {
        printf("%d. %s %s (%s)\n", i + 1, contacts[i].firstName, contacts[i].lastName, contacts[i].phoneNumber);
    }
}

void searchContact() {
    char lastName[50];
    int found = 0;

    if (contactCount == 0) {
        printf("Contact list is empty!\n");
        return;
    }

    printf("Enter last name to search: ");
    scanf("%49s", lastName);

    for (int i = 0; i < contactCount; i++) {
        if (strcmp(contacts[i].lastName, lastName) == 0) {
            printf("Contact found:\n%s %s (%s)\n", contacts[i].firstName, contacts[i].lastName, contacts[i].phoneNumber);
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("No contact found with last name '%s'.\n", lastName);
    }
}

void deleteContact() {
    char lastName[50];
    int found = 0;

    if (contactCount == 0) {
        printf("Contact list is empty!\n");
        return;
    }

    printf("Enter last name to delete: ");
    scanf("%49s", lastName);

    for (int i = 0; i < contactCount; i++) {
        if (strcmp(contacts[i].lastName, lastName) == 0) {
            for (int j = i; j < contactCount - 1; j++) {
                contacts[j] = contacts[j + 1];
            }
            contactCount--;
            printf("Contact deleted successfully!\n");
            found = 1;
            break;
        }
    }

    if (!found) {
        printf("No contact found with last name '%s'.\n", lastName);
    }
}
