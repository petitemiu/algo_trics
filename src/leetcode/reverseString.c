#include <malloc.h>

int str_len(char* s){
	int i = 0;
	while (s[i] != 0)
		++i;
	return i;
}

char* reverseString(char* s){
	int size = str_len(s);
	char* newstr = calloc(size + 1, sizeof(char));
	newstr[size] = 0;
	int i = 0;
	for (i; i < size; ++i){
		newstr[i] = s[size-i-1];
	}
	return newstr;
}
