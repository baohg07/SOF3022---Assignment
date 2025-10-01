const images = [
    "/uploads/ms_banner_img2.jpg",
    "/uploads/ms_banner_img3.jpg",
    "/uploads/ms_banner_img4.jpg"
];

let currentIndex = 0;
const bannerImages = document.getElementById("banner-img")

function updateImages() {
    bannerImages.src = images[currentIndex];
}

function nextImages() {
    currentIndex++;
    if(currentIndex >= images.length) currentIndex = 0;
    updateImages();
}

function prevImages() {
    currentIndex--;
    if(currentIndex < 0) currentIndex = images.length - 1;
    updateImages();
}

const productsNu = [
    {
        img: "https://product.hstatic.net/1000392326/product/bas33020-868k__bjn33020-788k_c4278075a1ec4cbb98305eaa72211722.jpg",
        name: "BAS33020 - Áo kiểu công sở vải lưới dáng croptop có lót vải habutai cổ đức phối vải lụa có nắp túi trang trí - PANTIO",
        price: 868000
    },
    {
        img: "https://product.hstatic.net/1000392326/product/bad13396-1098k__bqn13396-968k__2__22dcd75536554ffb9458f7fa7afb9fb8.jpg",
        name: "BQN13396 - Quần short vải linen dáng A ống quần phối ly xoè tạo kiểu - PANTIO",
        price: 968000
    },
    {
        img: "https://cdn.hstatic.net/products/1000392326/fat3482-568k__fqb203-_998k_f02d78095a4c4f4baf5848b57292eb9c.jpg",
        name: "FAT3482 - Áo thun thời trang vải cotton mỏng cổ tròn vai chờm có đệm vai gấu áo phối dây chun rút tạo kiểu - PANTIO",
        price: 568000
    },
    {
        img: "https://product.hstatic.net/1000392326/product/fdd9159-chua_sx__3__81299a29106a49c492f310dd3c6b882b.jpg",
        name: "FDD9159 - Đầm dệt kim vải len co giãn dáng ôm trễ vai eo nhún tạo kiểu - PANTIO",
        price: 1868000
    }
]

const productsNam = [
    {
        img: "https://product.hstatic.net/1000392326/product/map3013_-_998k_mqk5027_-_998k_2__a17619f9ece84ac3a64b753ff6e12c16.jpg",
        name: " MAP3013 - Áo Polo nam vải trơn màu hoạ tiết kẻ cổ áo form slim fit kiểu dáng ngắn tay - PANTIO",
        price: 499000
    },
    {
        img: "https://product.hstatic.net/1000392326/product/map3011_-_998k_mqn3059_-_798k_1__f40b7012784047a3bd39e6e49815608d.jpg",
        name: "MAP3011 - Áo Polo nam vải trơn màu hoạ tiết cổ áo form regular fit kiểu dáng ngắn tay - PANTIO",
        price: 499000
    },
    {
        img: "https://product.hstatic.net/1000392326/product/map3021_-_1198k_mqn3058_-_798k_1__7316915608584bfab9b7c8245af8500f.jpg",
        name: "MAP3021 - Áo Polo nam vải cotton trơn màu Form slim fit kiểu dáng ngắn tay - PANTIO",
        price: 599000
    },
    {
        img: "https://product.hstatic.net/1000392326/product/map3020_-_1198k_mqn3056_-_798k_1__c0c420bd82f24d49bca6a0cf8908b347_master.jpg",
        name: "MAP3020 - Áo Polo nam vải cotton trơn màu Form slim fit kiểu dáng ngắn tay - PANTIO",
        price: 499000
    }

]

function renderProducts(list) {
    const container = document.getElementById("product-list");
    container.innerHTML = "";

    list.forEach(product => {
        const shortName = product.name.length > 50
            ? product.name.substring(0, 50) + "..."
            : product.name;

        container.innerHTML += `
            <div class="card">
                <img src="${product.img}" alt="${product.name}" class="card-img-top">
                <div class="card-body">
                    <p class="card-text" title="${product.name}">${shortName}</p>
                    <h5>${product.price.toLocaleString()}₫</h5>
                </div>
            </div>
        `;
    });
}

function showProducts(type) {
    if (type === "nu") {
        renderProducts(productsNu);
    } else if (type === "nam") {
        renderProducts(productsNam);
    }
}

// load mặc định là Nữ
window.onload = () => showProducts("nu");