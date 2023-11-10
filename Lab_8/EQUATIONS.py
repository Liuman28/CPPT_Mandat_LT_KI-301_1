import math
class Equations:
 def calculate(self,x):
    rad = x * math.pi / 180.0
    try:
    # y = sin(x)/ctg(8x)=sin(x)*tan(8x)
        y = math.sin(rad)*math.tan(8*rad)
        if rad == math.pi or rad == (math.pi * 2):
            raise Exception
    except Exception as e:
        print("Exeption ",str(e))
        return 0
    return y