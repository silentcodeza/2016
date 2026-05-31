import turtle


def square(turt, ll_x, ll_y, edge):
		# draws a square, being given its lower left corner coordinates and edge length
		turt.penup()
		turt.goto(ll_x,ll_y)
		turt.setheading(0) # going towards the east
		turt.pendown()
		for i in range(4):
				turt.forward(edge)
				turt.left(90)



def rectangle(turt, ll_x, ll_y, edge_horiz, edge_vert):
		# draws a rectangle, being given its lower left corner coordinates and edge lengths
		turt.penup()
		turt.goto(ll_x,ll_y)
		turt.setheading(0) # going towards the east
		turt.pendown()
		for i in range(2):
				turt.forward(edge_horiz)
				turt.left(90)
				turt.forward(edge_vert)
				turt.left(90)





def cross(turt, center_x, center_y, stroke_len):
		# draw a "plus" sign, being given its center and stroke len
		half = stroke_len / 2
		turt.penup()
		turt.goto(center_x - half, center_y)
		turt.setheading(0) # going towards the east
		turt.pendown()
		turt.forward(stroke_len)
		turt.penup()
		for i in range(2):
				turt.left(90)
				turt.forward(half)
		turt.left(90)
		turt.pendown()
		turt.forward(stroke_len)


def char_canvas(turt,center_x,center_y,edge):
		#draws the canvas in grey
		half = edge / 2
		turt.pencolor("grey")
		turt.pensize(2)
		square(turt,center_x - half, center_y - half, edge)
		turt.pensize(1)
		cross(turt, center_x, center_y, edge)



def zhong(turt, x, y, edge):
		# write zhong(1) in red on the canvas centered on (x,y) and with edge length 
		turt.pencolor("red")
		turt.pensize(4)
		rectangle(turt, x - edge / 4, y, edge/2, edge*0.2)
		turt.penup()
		turt.goto(x,y+0.4*edge)
		turt.setheading(270) # heading down
		turt.pendown()
		turt.forward(0.8*edge)



def guo(turt, x, y, edge):
		# write guo(2) in red on the canvas centered on (x,y) and with edge length 
		turt.pencolor("red")
		turt.pensize(4)
		#square around
		square(turt, x - edge / 2 + edge*0.1, y - edge / 2 + edge*0.1, edge*0.8)
		# internal thing
		turt.penup()
		turt.goto(x-0.3*edge,y+0.25*edge)
		turt.setheading(0) # heading east
		turt.pendown()
		# top horizontal stroke
		turt.forward(0.6*edge)
		turt.backward(0.3*edge)
		turt.setheading(270) # down
		# vertical stroke
		turt.forward(0.5*edge)
		turt.left(90)
		turt.forward(0.3*edge)
		turt.backward(0.6*edge)
		# horizontal middle stroke
		turt.penup()
		turt.goto(x-0.2*edge,y)
		turt.pendown()
		turt.setheading(0)
		turt.forward(0.4*edge)

		# last small stroke
		turt.penup()
		turt.goto(x + 0.15*edge,y - 0.07 * edge)
		turt.setheading(310)
		turt.pendown()
		turt.forward(edge/7)





win = turtle.Screen()
mo = turtle.Turtle()
mo.hideturtle()
char_canvas(mo,20,30,200)
zhong(mo,20,30,200)
char_canvas(mo,240,30,200)
guo(mo,240,30,200)
win.mainloop()
