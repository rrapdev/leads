package br.com.roberth.leads.domain;

import static org.assertj.core.api.Assertions.assertThat;

import br.com.roberth.leads.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class ListaTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Lista.class);
        Lista lista1 = new Lista();
        lista1.setId(1L);
        Lista lista2 = new Lista();
        lista2.setId(lista1.getId());
        assertThat(lista1).isEqualTo(lista2);
        lista2.setId(2L);
        assertThat(lista1).isNotEqualTo(lista2);
        lista1.setId(null);
        assertThat(lista1).isNotEqualTo(lista2);
    }
}
