<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="formbold-main-wrapper">
    <div class="formbold-form-wrapper">

        <form action="save" method="POST">
            <div class="formbold-input-flex">
                <div>
                    <label for="firstname" class="formbold-form-label"> Motorbike ID </label>
                    <input
                        type="text"
                        name="motorID"
                        id="firstname"
                        placeholder=""
                        class="formbold-form-input"
                        value="${detail.motorBikeID}"
                        readonly
                        />
                </div>

                <div>
                    <label for="lastname" class="formbold-form-label"> Manufacturer ID </label>
                    <input
                        type="text"
                        name="manuID"
                        id="lastname"
                        placeholder="Your last name"
                        class="formbold-form-input"
                        value=""
                        />
                </div>
            </div>

            <div class="formbold-input-flex">
                <div>
                    <label class="formbold-form-label"> Name </label>
                    <input
                        type="text"
                        name="motorName"
                        id="email"
                        placeholder="example@email.com"
                        class="formbold-form-input"
                        value="${detail.motorName}"
                        />
                </div>

                <div>
                    <label class="formbold-form-label">Category</label>

                    <select class="formbold-form-input" name="category" id="occupation">
                        <option value="male">Xe Ga</option>
                        <option value="female">Xe Số</option>
                        <option value="others">Xe Phân Khối Lớn</option>
                        <option value="others">Xe Điện</option>
                    </select>
                </div>
            </div>

            <div class="formbold-input-flex">
                <div>
                    <label for="firstname" class="formbold-form-label"> Price</label>
                    <input
                        type="text"
                        name="price"
                        id="firstname"
                        placeholder=""
                        class="formbold-form-input"
                        value="${detail.price}"
                        />
                </div>

                <div>
                    <label for="lastname" class="formbold-form-label"> Stock </label>
                    <input
                        type="text"
                        name="stock"
                        id="lastname"
                        placeholder="Your last name"
                        class="formbold-form-input"
                        value="${detail.stock}"
                        />
                </div>
            </div>

            <div class="formbold-mb-3">
                <label for="age" class="formbold-form-label"> Image Path </label>
                <input
                    type="text"
                    name="img"
                    id="age"
                    class="formbold-form-input"
                    value="${detail.pic}"
                    />
            </div>     

            <div class="formbold-mb-3">
                <label for="message" class="formbold-form-label">
                    Detail
                </label>
                <textarea
                    rows="6"
                    name="detail"
                    id="message"
                    class="formbold-form-input"
                    >${detail.details}</textarea>
            </div>
            <input type="submit" style="background-color: #28a745" class="formbold-btn" value="Save Change">
        </form>
    </div>
</div>
<style>
    @import url('https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700&display=swap');
    * {
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    body {
        font-family: 'Inter', sans-serif;
    }
    .formbold-mb-3 {
        margin-bottom: 15px;
    }
    .formbold-main-wrapper {
        display: flex;
        align-items: center;
        justify-content: center;
        padding: 48px;
    }
    .formbold-form-wrapper {
        margin: 0 auto;
        max-width: 570px;
        width: 100%;
        background: white;
        padding: 40px;
    }
    .formbold-img {
        display: block;
        margin: 0 auto 45px;
    }
    .formbold-input-wrapp > div {
        display: flex;
        gap: 20px;
    }
    .formbold-input-flex {
        display: flex;
        gap: 20px;
        margin-bottom: 15px;
    }
    .formbold-input-flex > div {
        width: 50%;
    }
    .formbold-form-input {
        width: 100%;
        padding: 13px 22px;
        border-radius: 5px;
        border: 1px solid #dde3ec;
        background: #ffffff;
        font-weight: 500;
        font-size: 16px;
        color: #536387;
        outline: none;
        resize: none;
    }
    .formbold-form-input::placeholder,
    select.formbold-form-input,
    .formbold-form-input[type='date']::-webkit-datetime-edit-text,
    .formbold-form-input[type='date']::-webkit-datetime-edit-month-field,
    .formbold-form-input[type='date']::-webkit-datetime-edit-day-field,
    .formbold-form-input[type='date']::-webkit-datetime-edit-year-field {
        color: rgba(83, 99, 135, 0.5);
    }
    .formbold-form-input:focus {
        border-color: #6a64f1;
        box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
    }
    .formbold-form-label {
        color: #07074D;
        font-weight: 500;
        font-size: 14px;
        line-height: 24px;
        display: block;
        margin-bottom: 10px;
    }
    .formbold-form-file-flex {
        display: flex;
        align-items: center;
        gap: 20px;
    }
    .formbold-form-file-flex .formbold-form-label {
        margin-bottom: 0;
    }
    .formbold-form-file {
        font-size: 14px;
        line-height: 24px;
        color: #536387;
    }
    .formbold-form-file::-webkit-file-upload-button {
        display: none;
    }
    .formbold-form-file:before {
        content: 'Upload file';
        display: inline-block;
        background: #EEEEEE;
        border: 0.5px solid #FBFBFB;
        box-shadow: inset 0px 0px 2px rgba(0, 0, 0, 0.25);
        border-radius: 3px;
        padding: 3px 12px;
        outline: none;
        white-space: nowrap;
        -webkit-user-select: none;
        cursor: pointer;
        color: #637381;
        font-weight: 500;
        font-size: 12px;
        line-height: 16px;
        margin-right: 10px;
    }
    .formbold-btn {
        text-align: center;
        width: 100%;
        font-size: 16px;
        border-radius: 5px;
        padding: 14px 25px;
        border: none;
        font-weight: 500;
        background-color: #6a64f1;
        color: white;
        cursor: pointer;
        margin-top: 25px;
    }
    .formbold-btn:hover {
        box-shadow: 0px 3px 8px rgba(0, 0, 0, 0.05);
    }
    .formbold-w-45 {
        width: 45%;
    }
</style>