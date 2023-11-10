from phone import Phone


class MobilePhone(Phone):
    def __init__(self, price, developer, model, number, os, camera_px):
        super().__init__(price, developer, model, number)
        self._os = os
        self._camera_px = camera_px

    # Getter for os
    @property
    def os(self):
        return self._os

    # Setter for price
    @os.setter
    def os(self, value):
        self._os = value

    # Getter for developer
    @property
    def camera_px(self):
        return self._camera_px

    # Setter for developer
    @camera_px.setter
    def camera_px(self, value):
        self._camera_px = value

    def get_info(self):
        super().get_info()
        print(f"OS: {self._os}")
        print(f"Camera px: {self._camera_px}")
