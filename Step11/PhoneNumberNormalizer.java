import java.util.Arrays;

public class PhoneNumberNormalizer {
    public static void main(String[] args) {
        String[] phones = {
            "010-1234-5678",
            "010 1234 5678",
            "(010) 1234-5678",
            "010.1234.5678"
        };
        
        String[] newPhones;

        newPhones = phones;
        System.out.println(Arrays.toString(phones));
        System.out.println(Arrays.toString(newPhones));
        for (String phone : phones) {
            // TODO: 전화번호를 정제하여 숫자만 남기세요
            phone.replace("-", " ");
            phone.replace("(", " ");
            phone.replace(")", " ");
            phone.replace(".", " ");
            System.out.println(phone);
            // TODO: "010-XXXX-XXXX" 형식으로 변환하세요

            // TODO: 결과를 출력하세요
        }
    }
}