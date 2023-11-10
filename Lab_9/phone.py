class Phone:
    def __init__(self, price, developer, model, number):
        self._price = price
        self._developer = developer
        self._model = model
        self._number = number

    # Getter for price
    @property
    def price(self):
        return self._price

    # Setter for price
    @price.setter
    def price(self, value):
        self._price = value

    # Getter for developer
    @property
    def developer(self):
        return self._developer

    # Setter for developer
    @developer.setter
    def developer(self, value):
        self._developer = value

    # Getter for model
    @property
    def model(self):
        return self._model

    # Setter for model
    @model.setter
    def model(self, value):
        self._model = value

    # Getter for number
    @property
    def number(self):
        return self._number

    # Setter for number
    @number.setter
    def number(self, value):
        self._number = value

    def get_info(self):
        print(f"Model: {self._model}")
        print(f"Number: {self._number}")
        print(f"Developer: {self._developer}")
        print(f"Price: {self._price}$")
