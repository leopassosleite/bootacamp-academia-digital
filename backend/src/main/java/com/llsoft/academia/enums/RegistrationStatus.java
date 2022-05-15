package com.llsoft.academia.enums;

public enum RegistrationStatus {

	AGUARDANDO_PAGAMENTO(1), 
	PAGAMENTO_PENDENTE(2),
	PAGO(3);

	private int code;

	private RegistrationStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static RegistrationStatus valueOf(int code) {
		for (RegistrationStatus value : RegistrationStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de status inválido");
	}
}
