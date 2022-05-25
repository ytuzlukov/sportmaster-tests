package api_tests.tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;


import static api_tests.listeners.CustomAllureListener.withCustomTemplates;
import static io.restassured.RestAssured.given;

import static org.junit.jupiter.api.Assertions.*;

public class SmokeApiTests {
    String productId = "26103430299";

    @Test
    @AllureId("10113")
    @DisplayName("Add product for comparison")
    @Tags({@Tag("blocker"), @Tag("smoke"), @Tag("api")})
    @Owner("allure8")
    @Feature("API")
    void addForComparisonTest() {
        given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("content-type", "application/json;charset=UTF-8")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; " +
                        "SMID=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3Mi" +
                        "OiJTTTMwIiwiaWF0IjoxNjUzMTQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi" +
                        "1hZGYxLTcwNzQ4MWQ2NDgwOCIsImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQo" +
                        "VCEi4nJy05H0ysc1JO9su8SrlrBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8r" +
                        "kdW3HfeEf5zYisnrZPBtxtYDN1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp" +
                        "4fQSIk9aomoBjwVErucwZNizxddA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJ" +
                        "XOMj58fPjzPz5jlTd3a_pcmdgc-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4" +
                        "e5c8bb1b; tmr_lvid=9b33e93f8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371;" +
                        " _ym_uid=1653146371231773377; ins-logged-cartaban-nobonus=false; ins-logged-cartaban-with-bonus=false;" +
                        " SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bSI" +
                        "6MTY1MzE1MjA4N30=; userId=100000003941922367; userAuth=0; _gid=GA1.2.1342313109.1653334861;" +
                        " st_uid=080f4acb254e5ba844be9658a9402430; _ym_isad=1; _ym_visorc=w; ins-nonlogged-cartaban=true;" +
                        " spcount=43; _ga=GA1.2.1591888243.1653146370; _gat_UA-3450216-44=1; _dc_gtm_UA-3450216-4=1;" +
                        " _dc_gtm_UA-3450216-27=1; _ga_Z7E27793QJ=GS1.1.1653425275.9.1.1653427337.57; tmr_reqNum=397;" +
                        " tmr_detect=0%7C1653427339073")
                .header("origin", "https://www.sportmaster.ru")
                .header("referer", "https://www.sportmaster.ru/product/26103430299/")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "a0266761-12912903")
                .body("{\"productId\":\"" + productId + "\"}")
                .put("https://www.sportmaster.ru/web-api/v1/comparison/products/")
                .then()
                .statusCode(200);

    }

    @Test()
    @AllureId("10114")
    @DisplayName("Delete product from comparison")
    @Tags({@Tag("major"), @Tag("smoke"), @Tag("api")})
    @Owner("allure8")
    @Feature("API")
    void deleteFromComparisonTest() {
        given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("content-type", "application/json;charset=UTF-8")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; " +
                        "SMID=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3Mi" +
                        "OiJTTTMwIiwiaWF0IjoxNjUzMTQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi" +
                        "1hZGYxLTcwNzQ4MWQ2NDgwOCIsImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQo" +
                        "VCEi4nJy05H0ysc1JO9su8SrlrBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8r" +
                        "kdW3HfeEf5zYisnrZPBtxtYDN1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp" +
                        "4fQSIk9aomoBjwVErucwZNizxddA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJ" +
                        "XOMj58fPjzPz5jlTd3a_pcmdgc-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4" +
                        "e5c8bb1b; tmr_lvid=9b33e93f8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371;" +
                        " _ym_uid=1653146371231773377; ins-logged-cartaban-nobonus=false; ins-logged-cartaban-with-bonus=false;" +
                        " SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bSI" +
                        "6MTY1MzE1MjA4N30=; userId=100000003941922367; userAuth=0; _gid=GA1.2.1342313109.1653334861;" +
                        " st_uid=080f4acb254e5ba844be9658a9402430; _ym_isad=1; _ym_visorc=w; ins-nonlogged-cartaban=true;" +
                        " spcount=43; _ga=GA1.2.1591888243.1653146370; _gat_UA-3450216-44=1; _dc_gtm_UA-3450216-4=1;" +
                        " _dc_gtm_UA-3450216-27=1; _ga_Z7E27793QJ=GS1.1.1653425275.9.1.1653427337.57; tmr_reqNum=397;" +
                        " tmr_detect=0%7C1653427339073")
                .header("origin", "https://www.sportmaster.ru")
                .header("referer", "https://www.sportmaster.ru/product/26103430299/")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "a0266761-12912903")
                .body("{\"productId\":\"" + productId + "\"}")
                .put("https://www.sportmaster.ru/web-api/v1/comparison/products/")
                .then()
                .statusCode(200);

        given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; SMID=eyJhbGciOiJSUzI1NiJ9" +
                        ".eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3MiOiJTTTMwIiwiaWF0IjoxNjUzM" +
                        "TQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi1hZGYxLTcwNzQ4MWQ2NDgwOCI" +
                        "sImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQoVCEi4nJy05H0ysc1JO9su8Srl" +
                        "rBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8rkdW3HfeEf5zYisnrZPBtxtYDN" +
                        "1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp4fQSIk9aomoBjwVErucwZNizxd" +
                        "dA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJXOMj58fPjzPz5jlTd3a_pcmdgc" +
                        "-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4e5c8bb1b; tmr_lvid=9b33e93f" +
                        "8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371; _ym_uid=1653146371231773377;" +
                        " ins-logged-cartaban-nobonus=false; ins-logged-cartaban-with-bonus=false;" +
                        " SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bS" +
                        "I6MTY1MzE1MjA4N30=; userId=100000003941922367; userAuth=0; _gid=GA1.2.1342313109.1653334861;" +
                        " st_uid=080f4acb254e5ba844be9658a9402430; _ym_isad=1; _ym_visorc=w; ins-nonlogged-cartaban=true;" +
                        " _gat_UA-3450216-44=1; _dc_gtm_UA-3450216-4=1; _dc_gtm_UA-3450216-27=1; spcount=50;" +
                        " _ga_Z7E27793QJ=GS1.1.1653425275.9.1.1653428812.23; _ga=GA1.2.1591888243.1653146370;" +
                        " tmr_reqNum=456; tmr_detect=0%7C1653428815042")
                .header("origin", "https://www.sportmaster.ru")
                .header("referer", "https://www.sportmaster.ru/compare/")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "fcc0819c-13136078")
                .delete("https://www.sportmaster.ru/web-api/v1/comparison/products/"
                        + productId + "/")
                .then()
                .statusCode(200);
    }

    @Test
    @AllureId("10115")
    @DisplayName("Check product quantity")
    @Tags({@Tag("minor"), @Tag("smoke"), @Tag("api")})
    @Owner("allure8")
    @Feature("API")
    void checkProductQuantity() {
        String productId = "25572090299";
        String wareId = "187353280299";
        String response = given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("content-type", "application/json;charset=UTF-8")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; SMID=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3MiOiJTTTMwIiwiaWF0IjoxNjUzMTQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi1hZGYxLTcwNzQ4MWQ2NDgwOCIsImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQoVCEi4nJy05H0ysc1JO9su8SrlrBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8rkdW3HfeEf5zYisnrZPBtxtYDN1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp4fQSIk9aomoBjwVErucwZNizxddA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJXOMj58fPjzPz5jlTd3a_pcmdgc-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4e5c8bb1b; tmr_lvid=9b33e93f8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371; _ym_uid=1653146371231773377; ins-logged-cartaban-nobonus=false; ins-logged-cartaban-with-bonus=false; SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bSI6MTY1MzE1MjA4N30=; userId=100000003941922367; userAuth=0; _gid=GA1.2.1342313109.1653334861; st_uid=080f4acb254e5ba844be9658a9402430; _ym_isad=1; _ym_visorc=w; ins-nonlogged-cartaban=true; spcount=56; _ga=GA1.2.1591888243.1653146370; tmr_detect=0%7C1653429577610; tmr_reqNum=508; _ga_Z7E27793QJ=GS1.1.1653425275.9.1.1653429702.60; _dc_gtm_UA-3450216-4=1; _dc_gtm_UA-3450216-27=1")
                .header("origin", "https://www.sportmaster.ru")
                .header("referer", "https://www.sportmaster.ru/catalog/velosipedy_roliki_skeytbordy_samokaty_/?f-ware_grp=ware_grp_rolikovye_konki,ware_grp_samokaty,ware_grp_skeitbordy,ware_grp_velosipedy&f-promotion:globalpromo=true&sortType=BY_POPULARITY")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "8d4fa3fd-13167070")
                .body("{\"items\":[{\"productId\":\"" + productId + "\",\"wareId\":\"" + wareId + "\",\"quantity\":1}],\"cartFormat\":\"SIMPLE\"}")
                .post("https://www.sportmaster.ru/web-api/v1/cart/products/quantity/")
                .then()
                .statusCode(200)
                .extract()
                .asString();

        assertTrue(response.contains(productId));
    }

    @Test
    @AllureId("10112")
    @DisplayName("Check subscribe unavailable without captcha")
    @Tags({@Tag("major"), @Tag("smoke"), @Tag("api")})
    @Owner("allure8")
    @Feature("API")
    void checkSubscribeUnavailable() {
        given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("content-type", "application/json;charset=UTF-8")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; SMID=eyJhbGciOiJSUzI1NiJ9.eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3MiOiJTTTMwIiwiaWF0IjoxNjUzMTQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi1hZGYxLTcwNzQ4MWQ2NDgwOCIsImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQoVCEi4nJy05H0ysc1JO9su8SrlrBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8rkdW3HfeEf5zYisnrZPBtxtYDN1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp4fQSIk9aomoBjwVErucwZNizxddA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJXOMj58fPjzPz5jlTd3a_pcmdgc-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4e5c8bb1b; tmr_lvid=9b33e93f8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371; _ym_uid=1653146371231773377; ins-logged-cartaban-nobonus=false; ins-logged-cartaban-with-bonus=false; SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bSI6MTY1MzE1MjA4N30=; userId=100000003941922367; userAuth=0; _gid=GA1.2.1342313109.1653334861; ins-nonlogged-cartaban=false; st_uid=080f4acb254e5ba844be9658a9402430; _ym_isad=1; spcount=27; _ym_visorc=w; _ga=GA1.2.1591888243.1653146370; _gat_UA-3450216-44=1; _dc_gtm_UA-3450216-4=1; _dc_gtm_UA-3450216-27=1; tmr_detect=0%7C1653425283699; _ga_Z7E27793QJ=GS1.1.1653425275.9.0.1653425292.43; tmr_reqNum=228")
                .header("origin", "https://www.sportmaster.ru")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "729bd295-12906366")
                .body("{\"token\":\"03AGdBq25mtsmEGU8kHtjwITch54vO9sKjDbtYEM2YpO_WiuT3M0Y5HxWwN03VEw4FO56X3FTLV6i7YH4C1H6OQ0ddw3LQseBaO5kn_03xBiFekb1Y5YoVO0b6sDg4Qs0Rm0ZyypwfQAsV7bSlJJCijEP2eCCBVBDtEZi993bR6Q0lbad_qxFke-tvQaGGcV0fQQpWqJrOHxCJRJ0oFmZDtUYJ4c_UEH1jF5jUSD2HlOWZKG_MV8pPoLuwk--Ih8TS3BJyqKUc7-jTruRbFWvty4Mm1kPa3OdLZddhhJfHyDL0vkfARdKCqPvk-pqFXAaCJNGpYOAdeiSsLt6mtUKC_RrkY_RP4mZbKn3mJ5CfhIE5Ov6grKZ5sF6pvw9OIjm39ejLpsYlT_LmvUQ20sPhuFZ4-sU-nxhWcaNd74yW2kBgFbEo9W2ZfFExGw9zugWHKZ2lp1qa__VDQP4qZV11U9e72_4FRjB4KA\",\"source\":\"footer\",\"channel\":{\"type\":\"EMAIL\",\"destination\":\"tyzluckoff1@yandex.ru\"}}")
                .post("https://www.sportmaster.ru/web-api/v1/subscription/")
                .then()
                .statusCode(400);
    }

    @Test
    @AllureId("10350")
    @DisplayName("Get auto hints")
    @Tags({@Tag("blocker"), @Tag("smoke"), @Tag("api")})
    @Owner("allure8")
    @Feature("API")
    void getAutoHints() {
        String query = "test";
        String response = given().filter(withCustomTemplates())
                .header("authority", "www.sportmaster.ru")
                .header("accept", "application/json, text/plain, */*")
                .header("accept-language", "ru-RU,ru;q=0.9,en-US;q=0.8,en;q=0.7")
                .header("cookie", "UDID=d10ac215-e470-475f-9616-2072098b3185; SMID=eyJhbGciOiJSUzI1NiJ9" +
                        ".eyJqdGkiOiI2Y2YwYzM2ZS1hODllLTRkMDctOWRjMC0yZDUwNjhiOWRhOTQiLCJpc3MiOiJTTTMwIiwiaWF0IjoxNjU" +
                        "zMTQ2MzY0LCJhdWQiOiJzcG9ydG1hc3RlciIsImFuVCI6IjQ1YTU0M2QwLWE2MjYtNDZkNi1hZGYxLTcwNzQ4MWQ2NDg" +
                        "wOCIsImFuUCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YWM3MzUxMzcxNSJ9.vRLcRQoVCEi4nJy05H0ysc1JO9" +
                        "su8SrlrBozb-Zv3qdOuOUHJOzIrhMJFfwboGDAzBPWlLOsB9TRwtbwhkhUS_UVCzt1r7xMRYa8rkdW3HfeEf5zYisnrZ" +
                        "PBtxtYDN1Y2UzL9yN1lURFrXUM3ByLi5QRBLT_bXqi8BLwCuqNCUdUtDDDbQFXRwZsOGTkWCzlmp4fQSIk9aomoBjwV" +
                        "ErucwZNizxddA9DOQ8CH2-K6V5GHUNIydHst7tom4-wz4er5zBlvw7UX4Ac8UIOq7rtM4DDhv_O_iJXOMj58fPjzPz5j" +
                        "lTd3a_pcmdgc-8vATzcEaJD4EAlfbVF0m68bpxMuw; uxs_uid=692e6220-d919-11ec-9d61-f9d4e5c8bb1b;" +
                        " tmr_lvid=9b33e93f8c25ce337326806346b22410; tmr_lvidTS=1653146370504; _ym_d=1653146371;" +
                        " _ym_uid=1653146371231773377; ins-logged-cartaban-nobonus=false;" +
                        " ins-logged-cartaban-with-bonus=false; SMAUTH=eyJpZCI6ImY5NWRmZGVkLTRmYjItNGI3ZS1iODM2LTk5YW" +
                        "M3MzUxMzcxNSIsInN0IjoiUkVUVVJORUQiLCJ0bSI6MTY1MzE1MjA4N30=; userId=100000003941922367;" +
                        " userAuth=0; _gid=GA1.2.1342313109.1653334861; st_uid=080f4acb254e5ba844be9658a9402430;" +
                        " _ym_isad=1; _ym_visorc=w; ins-nonlogged-cartaban=true; _dc_gtm_UA-3450216-4=1;" +
                        " _dc_gtm_UA-3450216-27=1; _gat_UA-3450216-44=1; spcount=58; _ga_Z7E27793QJ=GS1.1.1653425275" +
                        ".9.1.1653430537.50; _ga=GA1.2.1591888243.1653146370; tmr_reqNum=527; tmr_detect=0%7C1653430540116")
                .header("sec-ch-ua", "\" Not A;Brand\";v=\"99\", \"Chromium\";v=\"101\", \"Google Chrome\";v=\"101\"")
                .header("sec-ch-ua-mobile", "?0")
                .header("sec-ch-ua-platform", "\"Windows\"")
                .header("sec-fetch-dest", "empty")
                .header("sec-fetch-mode", "cors")
                .header("sec-fetch-site", "same-origin")
                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                        "(KHTML, like Gecko) Chrome/101.0.4951.67 Safari/537.36")
                .header("x-sm-accept-language", "ru-RU")
                .header("x-sm-tracing-id", "24d23015-13069865")
                .get("https://www.sportmaster.ru/web-api/v1/products/auto-hints/?query="
                        + query)
                .then()
                .statusCode(200)
                .extract()
                .asString();

        assertTrue(response.contains(query));
    }

}
