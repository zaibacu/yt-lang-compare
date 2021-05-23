#include <iostream>

using namespace std;

void print(int* arr, int n) {
	for(int i=0; i<n; i++){
		cout << arr[i] << ", ";
	}

	cout << endl;
}

int min(int* arr, int n, int offset){
	int m = offset;
	for(int i=offset; i<n; i++){
		if(arr[i] < arr[m]){
			m = i;
		}
	}

	return m;
}

void swap(int* arr, int a, int b){
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
}

void sort(int* arr, int n){
	for(int i=0; i<n; i++){
		int m = min(arr, n, i);
		swap(arr, i, m);
	}
}

int main(){
	int numbers[] = {2, 6, 7, 1, 2, 3, 4, 5};
	int n = 8;
	print(numbers, n);
	sort(numbers, n);
	print(numbers, n);
	return 0;
}