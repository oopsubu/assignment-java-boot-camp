## Flow
*ลูกค้าเป็นสมาชิกของระบบแล้ว (มีข้อมูลส่วนตัว, ข้อมูลที่อยู่, ข้อมูลสำหรับการชำระเงิน)
* ลูกค้า Login เข้าใช้งานระบบ
* แสดงรายการข้อมูลสินค้า
* ลูกค้าค้นหาข้อมูลสินค้าที่ต้องการโดยระบุชื่อสินค้า ระบบจะแสดงรายการสินค้าตามที่ลูกค้าค้นหา
* ลูกค้าเลือกสินค้าที่ต้องการจากรายการสินค้าที่ค้นหา ระบบจะแสดงรายละเอียดของสินค้าที่ลูกค้าเลือก
* ลูกค้าเลือกสินค้าเข้าตะกร้า ระบบแสดงรายละเอียดสินค้าที่ลูกค้าเลือก เช่น ชื่อสินค้า, รูปสินค้า, ขนาด, ราคา, จำนวนคงเหลือ...
* ลูกค้าระบุข้อมูลของสินค้า เช่น ขนาด, จำนวน แล้วเลือกเพิ่มสินค้าเข้าตะกร้า
* แสดงข้อมูลรายละเอียดของสินค้าในตะกร้า เช่น รายการสินค้า, จำนวน, ราคา
* ลูกค้ากดปุ่มชำระสินค้า ระบบจะแสดงข้อมูลการสั่งซื้อสินค้า และให้ลูกค้าระบุที่อยู่ในการจัดส่งสินค้า
* ลูกค้ากดดำเนินการต่อ เพื่อทำการชำระเงิน ระบบจะแสดงข้อมูลการสั่งซื้อสินค้า, ที่อยู่ในการจัดส่ง แล้วลูกค้าระบุส่วนลด(ถ้ามี) และให้ลูกค้าระบุช่องทางและรายละเอียดการชำระเงิน
* หลังจากระบุข้อมูลครบถ้วนแล้วลูกค้าสั่งซื้อสินค้า ระบบจะทำการหักเงินค่าสินค้าจากช่องทางที่ลูกค้าระบุและตัดสต๊อกสินค้า
* ระบบแสดงรายการสั่งซื้อรวมถึงรายละเอียดการชำระเงินและจัดส่ง

##Database Design

<img src="https://user-images.githubusercontent.com/5071334/155875265-59cfab46-8fc6-43d9-aada-576e33870ad0.png" alt="ERD" title="Database Design">

##API
<table role="table">
<thead>
<tr>
<th>Method</th>
<th>Url</th>
<th>Description</th>
<th>Sample Valid Request Body</th>
<th>Sample Valid Response Body</th>
</tr>
</thead>
<tbody>
<tr>
<td>POST</td>
<td>/api/auth/signin</td>
<td>Log in</td>
<td>username='test'&password:'secretPassword'</td>
<td>Jwt TOKEN</td>
</tr>
<tr>
<td>GET</td>
<td>/api/product/list</td>
<td>List all product</td>
<td></td>
<td>[{
        "id": 2,
        "price": 3990.0,
        "name": "NMD R1 V2 “White GoldClub”",
        "desc": "รองเท้าผ้าใบแฟชั่น NMD R1 V2 “White GoldClub”",
        "createdAt": "2022-02-26T06:24:30.189+00:00",
        "modifiedAt": null,
        "deletedAt": null,
        "productCategory": {
            "id": 1,
            "name": "รองเท้า",
            "desc": "หมวดหมู่รองเท้า",
            "createdAt": "2022-02-26T06:24:30.182+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "productInventory": {
            "id": 3,
            "quantity": 13,
            "createdAt": "2022-02-26T06:24:30.188+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "product": null,
        "discountId": null,
        "sku": ""
    },...
]</td>
</tr>
<tr>
<td>GET</td>
<td>/api/product/search?criteria=''</td>
<td>Search product by criteria</td>
<td></td>
<td>[{
        "id": 2,
        "price": 3990.0,
        "name": "NMD R1 V2 “White GoldClub”",
        "desc": "รองเท้าผ้าใบแฟชั่น NMD R1 V2 “White GoldClub”",
        "createdAt": "2022-02-26T06:24:30.189+00:00",
        "modifiedAt": null,
        "deletedAt": null,
        "productCategory": {
            "id": 1,
            "name": "รองเท้า",
            "desc": "หมวดหมู่รองเท้า",
            "createdAt": "2022-02-26T06:24:30.182+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "productInventory": {
            "id": 3,
            "quantity": 13,
            "createdAt": "2022-02-26T06:24:30.188+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "product": null,
        "discountId": null,
        "sku": ""
    },...
]</td>
</tr>
<tr>
<td>GET</td>
<td>/api/product/{productId}</td>
<td>Get product by product id</td>
<td></td>
<td>{
        "id": 2,
        "price": 3990.0,
        "name": "NMD R1 V2 “White GoldClub”",
        "desc": "รองเท้าผ้าใบแฟชั่น NMD R1 V2 “White GoldClub”",
        "createdAt": "2022-02-26T06:24:30.189+00:00",
        "modifiedAt": null,
        "deletedAt": null,
        "productCategory": {
            "id": 1,
            "name": "รองเท้า",
            "desc": "หมวดหมู่รองเท้า",
            "createdAt": "2022-02-26T06:24:30.182+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "productInventory": {
            "id": 3,
            "quantity": 13,
            "createdAt": "2022-02-26T06:24:30.188+00:00",
            "modifiedAt": null,
            "deletedAt": null
        },
        "product": null,
        "discountId": null,
        "sku": ""
    }
</td>
</tr>
<tr>
<td>POST</td>
<td>/api/cart/add/{productId}</td>
<td>Add product to cart</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/cart/list</td>
<td>รายละเอียดของสินค้าที่อยู่ในตะกร้า</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/cart/info/{cartId}</td>
<td>รายละเอียดของสินค้าและจำนวนเงินที่ต้องชำระในครั้งนี้</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/user/address/shipto</td>
<td>ระบุที่อยู่ในการจัดส่ง</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/user/payment/info</td>
<td>ระบุข้อมูลสำหรับการชำระเงิน</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/promotion/{promotionCode}</td>
<td>ตรวจสอบรหัสส่วนลด</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/payment/gateway</td>
<td>ระบบชำระเงิน</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/product/inventory</td>
<td>ตัดสต็อกสินค้า</td>
<td>JSON</td>
<td>JSON</td>
</tr>
<tr>
<td>POST</td>
<td>/api/summary/cart/{cartId}</td>
<td>สรุปการสั่งซื้อ</td>
<td>JSON</td>
<td>JSON</td>
</tr>
</tbody>
</table>

