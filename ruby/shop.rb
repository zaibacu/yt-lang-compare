class Product
	attr_accessor :name, :price

	def initialize(name, price)
		@name = name
		@price = price
	end
end

class OrderItem
	attr_accessor :product, :qty

	def initialize(product, qty)
		@product = product
		@qty = qty
	end
end


class Order
	def initialize(items)
		@order_items = items
	end

	def total_sum
		@order_items.map{ |x| x.product.price * x.qty }.sum()
	end
end

p1 = Product.new("Generic Mouse", 12)
p2 = Product.new("Generic Keyboard", 10)
p3 = Product.new("Candy Bar", 1.5)

o = Order.new([
		OrderItem.new(p1, 1),
		OrderItem.new(p3, 10)
	])

print(o.total_sum())