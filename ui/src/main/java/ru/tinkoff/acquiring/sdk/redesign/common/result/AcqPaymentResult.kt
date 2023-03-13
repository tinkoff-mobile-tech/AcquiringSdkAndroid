package ru.tinkoff.acquiring.sdk.redesign.common.result

/**
 * Created by i.golovachev
 */
sealed interface AcqPaymentResult {

    interface Success: AcqPaymentResult {
        val paymentId: Long?
        val cardId: String?
        val rebillId: String?
    }

    interface Error : AcqPaymentResult {
        val error: Throwable
        val errorCode: Int?
    }

    interface Canceled : AcqPaymentResult
}