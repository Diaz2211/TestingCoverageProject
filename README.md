# TestingCoverageProject

## Giới thiệu

Project Java dùng để thực hành **JUnit 5** và các kỹ thuật kiểm thử phần mềm dựa trên độ bao phủ chương trình (**code coverage**).

Chương trình chính là `ScoreCalculator`, gồm một vòng lặp `for` và một cấu trúc rẽ nhánh `if/else`.

## Chức năng chương trình

Phương thức `calculateScore(int[] scores)` tính tổng điểm theo quy tắc:

- Nếu điểm `>= 50`: cộng chính điểm đó vào tổng.
- Nếu điểm `< 50`: cộng `10` vào tổng.
- Duyệt toàn bộ phần tử của mảng bằng vòng lặp `for`.

Ví dụ:

```text
Input:  [45, 60, 80]
Output: 150
```

Tính toán:

```text
45 < 50  -> +10
60 >= 50 -> +60
80 >= 50 -> +80
Tổng = 150
```

## Cấu trúc project

```text
TestingCoverageProject/
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/diaz2211/
    │           └── ScoreCalculator.java
    └── test/
        └── java/
            └── com/diaz2211/
                ├── ScoreCalculatorStatementTest.java
                └── ScoreCalculatorPathTest.java
```

## Công nghệ sử dụng

- Java
- Maven
- JUnit 5

## Các Issue và kiểm thử

### Issue #1 - Statement Coverage

Viết các ca kiểm thử JUnit để thực thi tất cả các câu lệnh trong `calculateScore`.

Các test bao phủ:

- Khởi tạo biến `total`.
- Vòng lặp `for`.
- Nhánh `if` (`score >= 50`).
- Nhánh `else` (`score < 50`).
- Câu lệnh `return`.

### Issue #2 - Path Coverage

Viết các ca kiểm thử JUnit để bao phủ các đường đi khả thi trong chương trình.

Các test bao phủ:

- Đường đi không thực hiện vòng lặp với mảng rỗng.
- Đường đi qua nhánh `if`.
- Đường đi qua nhánh `else`.
- Các tổ hợp `if/else` khác nhau trong nhiều lần lặp.

## Chạy chương trình

Nếu đã cài Java và Maven, chạy:

```bash
mvn compile
```

Sau đó có thể chạy chương trình `ScoreCalculator` để kiểm tra kết quả.

## Chạy JUnit Test

Chạy toàn bộ test bằng:

```bash
mvn test
```

Nếu tất cả test thành công, Maven sẽ báo các test đã chạy và không có test thất bại.

## Mục tiêu của project

Project được xây dựng nhằm minh họa sự khác nhau giữa:

- **Statement Coverage:** đảm bảo tất cả các câu lệnh trong chương trình được thực thi ít nhất một lần.
- **Path Coverage:** kiểm thử các đường đi khác nhau qua vòng lặp và các nhánh điều kiện.

Hai loại kiểm thử được tổ chức thành các commit riêng tương ứng với hai Issue trên GitHub.