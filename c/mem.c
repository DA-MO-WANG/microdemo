#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include "common.h"

int 
main(int argc, char *argv[]) {
	int *p = malloc(sizeof(int));
	assert(p != Null);
	printf("(%d) memory address of p: %08x\n",getpid(),(unsigned) p);
	*p = 0;
	while(1) {
		Spin(1);
		*p = *p + 1;
		printf("(%d) p: %d\n", getid(), *p);
	}
	return 0;
}
