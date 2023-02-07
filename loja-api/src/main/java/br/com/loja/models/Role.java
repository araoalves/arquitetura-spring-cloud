package br.com.loja.models;

import br.com.loja.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

	private UUID id;
	private ERole name;
}