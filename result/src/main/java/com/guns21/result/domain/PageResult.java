package com.guns21.result.domain;


import java.util.List;

/**
 * @param <T>
 */
public class PageResult<T> extends AbstractResult<T> {
    protected int current; //当前页数
    protected int pageSize; //每页条数
    protected int totals;

    protected static PageResult getInstance() {
        return new PageResult();
    }

    protected static <T> PageResult<T> getInstance(Boolean aTrue, String message, String code, List<T> object) {
        PageResult result = getInstance();
        result.setSuccess(aTrue);
        result.setMessage(message);
        result.setCode(code);
        result.setData(object);
        return result;
    }


    public static <T> PageResult<T>  success() {
        return success(Code.CODE_200.text, Code.CODE_200.code);
    }

    public static <T> PageResult<T>  success(List<T> object) {
        return success(Code.CODE_200.text, Code.CODE_200.code, object);
    }

    /**
     * 通用成功
     *
     * @param message 成功信息
     * @return 返回成功结果
     */
    public static <T> PageResult<T>  success(String message) {
        return success(message, Code.CODE_200.code);
    }

    /**
     * 通用成功
     *
     * @param code    成功编码
     * @param message 成功信息
     * @return 返回成功结果
     */
    public static <T> PageResult<T>  success(String message, String code) {
        return success(message, code, null);
    }

    /**
     * 通用成功
     *
     * @param code    成功编码
     * @param message 成功信息
     * @param object  对象信息
     * @return 返回成功结果
     */
    public static <T> PageResult<T>  success(String message, String code, List<T> object) {
        return getInstance(Boolean.TRUE, message, code, object);
    }


    /**
     * 通用异常
     *
     * @param message 失败信息
     * @return 返回失败信息和500
     */
    public static <T> PageResult<T>  fail(String message) {
        return fail(message, Code.CODE_500.code);
    }

    public static <T> PageResult<T>  fail() {
        return fail(Code.CODE_500.text, Code.CODE_500.code);
    }

    /**
     * 通用异常
     *
     * @param message 失败信息
     * @return 返回失败结果
     */
    public static <T> PageResult<T>  fail(String message, String code) {
        return fail(message, code, null);
    }

    /**
     * 通用异常
     *
     * @param code    失败编码
     * @param message 失败信息
     * @param object  对象信息
     * @return 返回失败结果
     */
    public static <T> PageResult<T>  fail(String message, String code, List object) {
        return getInstance(Boolean.FALSE, message, code, object);
    }

    public int getCurrent() {
        return current;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotals() {
        return totals;
    }
}
