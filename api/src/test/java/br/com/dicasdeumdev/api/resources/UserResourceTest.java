package br.com.dicasdeumdev.api.resources;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.modelmapper.ModelMapper;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.dicasdeumdev.api.domain.User;
import br.com.dicasdeumdev.api.domain.dto.UserDTO;
import br.com.dicasdeumdev.api.services.impl.UserServiceImpl;

@SpringBootTest
class UserResourceTest {

	private static final int INDEX = 0;

	private static final String OBJETO_NAO_ENCONTRADO = "Objeto não encontrado";

	private static final String PASSWORD = "123";

	private static final String EMAIL = "valdir@email.com";

	private static final String NAME = "Valdir";

	private static final Integer ID = 1;

	private User user;

	private UserDTO userDTO;

	@InjectMocks
	private UserResource resource;

	@Mock
	private UserServiceImpl service;

	@Mock
	private ModelMapper mapper;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
		startUser();
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	private void startUser() {
		user = new User(ID, NAME, EMAIL, PASSWORD);
		userDTO = new UserDTO(ID, NAME, EMAIL, PASSWORD);

	}

}
