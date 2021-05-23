#include <iostream>
#include <vector>

using namespace std;

struct Product {
	const char* name;
	double price;
};

struct OrderItem {
	Product product;
	int qty;
};

struct Order {
	std::vector<OrderItem> orderItems;

	double totalSum(){
		double sum = 0;
		for(const OrderItem& item : orderItems){
			sum += item.product.price * item.qty;
		}
		return sum;
	}
};

int main(){
	Product p1 = { .name = "Generic Mouse", .price = 12 };
	Product p2 = { .name = "Generic Keyboard", .price = 10 };
	Product p3 = { .name = "Candy Bar", .price = 1.5 };

	Order o;

	o.orderItems.push_back((OrderItem){ .product = p1, .qty = 1});
	o.orderItems.push_back((OrderItem){ .product = p3, .qty = 10});

	cout << o.totalSum() << endl;
	return 0;
}