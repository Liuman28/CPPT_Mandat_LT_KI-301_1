from mobilePhone import MobilePhone, Phone

if __name__ == '__main__':
    # Phone class
    phone = Phone(1000, "Apple", 6, "0679094422")
    phone.model = "A7"
    phone.get_info()
    print("--------------------------------------------")
    phone.developer = "Sumsung"
    phone.get_info()
    print("--------------------------------------------")
    # MobilePhone Class
    mobile = MobilePhone(100, "oppo", "al234", "4563451", "Linux", 102)
    mobile.os = "Windows"
    mobile.get_info()
    print("--------------------------------------------")
