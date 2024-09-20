Feature: Parcel Management for Admin
  As an admin,
  I want to manage parcel information
  So that I can view, add, update, and delete parcel data

  Background:
    Given Yönetici login sayfasına gider
    When Yönetici geçerli "admin_email@example.com" ve "admin_password" ile giriş yapar

  Scenario: Admin views parcel information
    When Yönetici "Parcels" sayfasına gider
    Then Parcel bilgilerini görüntüler

  Scenario: Admin adds new parcel information
    When Yönetici "Parcels" sayfasına gider
    And Yönetici yeni bir parcel bilgisi ekler
    Then Parcel başarıyla eklenir

  Scenario: Admin updates existing parcel information
    When Yönetici "Parcels" sayfasına gider
    And Yönetici var olan bir parcel bilgisini günceller
    Then Parcel bilgisi başarıyla güncellenir

  Scenario: Admin deletes a parcel information
    When Yönetici "Parcels" sayfasına gider
    And Yönetici bir parcel bilgisini siler
    Then Parcel bilgisi başarıyla silinir

