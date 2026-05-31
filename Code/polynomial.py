def derivative(poly):
        result =[];
        for n in range(1,len(poly)):
            result.append(n*poly[n])
        return result
def eval0(poly,x):
    value =0
    for i in range(len(poly)):
        value +=poly[i]*x**i
        return value
def eval():
    return pass

fx = eval0([8,4,6,8],3)
fn = derivative("2x,4x,5x")
print(fx)
