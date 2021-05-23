class Product(object):
	def __init__(self, name, price):
		self.name = name
		self.price = price


class OrderItem(object):
	def __init__(self, product, qty):
		self.product = product
		self.qty = qty


class Order(object):
	def __init__(self, items):
		self.items = items

	def total_sum(self):
		return sum([(item.product.price * item.qty) for item in self.items])




p1 = Product("Generic Mouse", 12)
p2 = Product("Generic Keyboard", 10)
p3 = Product("Candy Bar", 1.5)

o = Order([
		OrderItem(p1, 1),
		OrderItem(p3, 10)
	])

print(o.total_sum())