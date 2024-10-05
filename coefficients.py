import numpy as np

x = np.array([1, 2, 3, 4, 5, 6, 7, 8])
y = np.array([-2, -1, 1, 2, 2, 1, -1, -2])
coefficients = np.polyfit(x, y, 7)
polynomial = np.poly1d(coefficients)